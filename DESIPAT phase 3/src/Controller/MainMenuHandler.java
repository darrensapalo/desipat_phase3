/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginMenu;
import View.Page;
import View.MainMenu;
import View.ModifyAsset;
import View.AssetViewer;
import View.DeleteAsset;
import Model.AssetModel;
import Model.DBHandler;
import Model.Bean.Asset;
import View.Builders.AbstractPageBuilder;
import View.Builders.AssetViewerBuilder;
import View.Builders.DeleteAssetBuilder;
import View.Builders.LoginBuilder;
import View.Builders.ModifyAssetBuilder;
import View.Decorators.CustodianModifyAssetDecorator;
import View.Decorators.ModifyAssetDecorator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Jan
 */
public class MainMenuHandler implements ActionListener {
    
    private MainMenu m;
    
    public MainMenuHandler(MainMenu m)
    {    
        this.m = m;
    }
    @Override
      public void actionPerformed(ActionEvent e) {
                DBHandler b;
                b = new DBHandler();
                AbstractPageBuilder form;
                    
                       
                    if(e.getSource().equals(m.getBtAdd())){
                       
                        form = new ModifyAssetBuilder();
                        Page add = PageDirector.buildPage(form);
                        
                        ModifyAsset a = (ModifyAsset)add;
                        a.setValues(m.getUserType(), m.getLbName().getText(),m.getUserID());
                        a.addBtnAddEditListener(new ModifyAssetHandler(a));
                        
                        add = a;
                        add.setVisible(true);
                        add.setLocationRelativeTo(null);
                        
                        add.setVisible(true);
                    }
                    else if(e.getSource().equals(m.getBtDelete())){
                        Vector<String> rAssets = m.getAssetIDs();
            int index = m.getListOfAsset().getSelectedIndex();
                        
            if (index == -1)
            JOptionPane.showMessageDialog(null, "Please select an asset from the list.", "Error", JOptionPane.ERROR_MESSAGE);
            else
            {
                        int n = Integer.parseInt(rAssets.elementAt(index));
                        form= new DeleteAssetBuilder();
                        Page del = PageDirector.buildPage(form);
                        
                        DeleteAsset d = (DeleteAsset) del;
                        //d.setValues(b.viewAsset(n),m.getPassword(), m.getUserType(),m.getLbName().getText());
                        
                        
                        d.setUserType(m.getUserType());
                        d.setUsername(m.getLbName().getText());
                        d.setPW(m.getPassword());
                        
                        ResultSet asset = b.viewAsset(n);
                        try {
                            asset.next();
                            d.setAssetName((asset.getString("assetname")));
                            d.setaID(asset.getInt("assetID"));
                        }
                        catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                        
                        del=d;
                        del.setVisible(true);
            }
                    }
                    else if(e.getSource().equals(m.getBtEdit())){
                        Vector<String> rAssets = m.getAssetIDs();
            int index = m.getListOfAsset().getSelectedIndex();
                        
            if (index == -1) 
                            JOptionPane.showMessageDialog(null, "Please select an asset from the list.", "Error", JOptionPane.ERROR_MESSAGE);
                                          
            else{
                            int n = Integer.parseInt(rAssets.elementAt(index));
                            form = new ModifyAssetBuilder();
                            Page edit = PageDirector.buildPage(form);
                            
                            ModifyAssetDecorator Deco = new ModifyAssetDecorator(edit, b.viewAsset(n));
                            edit = Deco.getForm();
                            
                            ModifyAsset editing = (ModifyAsset)edit;
                            editing.setValues(m.getUserType(), m.getLbName().getText(),m.getUserID());
                            edit = editing;
                            

                            
                            if (m.getUserType().equalsIgnoreCase("custodian")){
                                
                            	CustodianModifyAssetDecorator Decor = new CustodianModifyAssetDecorator(edit);
                                edit = Decor.getForm();
                                edit.setVisible(true);
                                edit.setLocationRelativeTo(null);
                                
                                
                                
                            }
                            else if (m.getUserType().equalsIgnoreCase("owner")){
                                editing = (ModifyAsset)edit;
                                edit = editing;
                                
                                edit.setVisible(true);
                                edit.setLocationRelativeTo(null);
                            } 
            }
                    }
                    else if(e.getSource().equals(m.getBtView())){
                        Vector<String> rAssets = m.getAssetIDs();
            int index = m.getListOfAsset().getSelectedIndex();
                        
            if (index == -1)
            JOptionPane.showMessageDialog(null, "Please select an asset from the list.", "Error", JOptionPane.ERROR_MESSAGE);
            else
            {
            int n = Integer.parseInt(rAssets.elementAt(index));
                        
                        form = new AssetViewerBuilder();
                        Page view = PageDirector.buildPage(form);
                        
                        AssetViewer a = (AssetViewer) view;
                        a.addActionListener(new AssetViewerHandler(a));
                        a.setAssetID(n);
                        AssetModel am = new AssetModel();
                        Asset asset = am.getAsset(b.viewAsset(n));
                        
                        a.SetValues(asset, b.getPreviousOwner(n), m.getUserType(), m.getLbName().getText());
                        view=a;
                        view.setVisible(true);
                        
                        a.setVisible(true);
            }
                    }
                    else if(e.getSource().equals(m.getBtLogout())){
                        form = new LoginBuilder();
                        Page login = PageDirector.buildPage(new LoginBuilder());
                		login.addActionListener(new LoginMenuHandler((LoginMenu) login));
                        
                        m.dispose();
                        
                        login.setVisible(true);
                        login.setLocationRelativeTo(null);
                    }
                    else if(e.getSource().equals(m.getBtRefresh())){
                        ControllerUtility.Update(b);
                    }
                    
                }
          
          
      }
    
