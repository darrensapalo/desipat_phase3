/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Page;
import View.MainMenu;
import View.ModifyAsset;
import View.AssetViewer;
import View.DeleteAsset;
import Model.DBHandler;
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
public class MainMenuHandler implements ActionListener{
    
    private MainMenu m;
    
    public MainMenuHandler(MainMenu m)
    {    
        this.m = m;
    }
    @Override
      public void actionPerformed(ActionEvent e) {
                DBHandler b;
                b = new DBHandler();
                
                    PageDirector f = new PageDirector();
                    AbstractPageBuilder form;
                    
                       
                    if(e.getSource().equals(m.getBtAdd())){
                       
                        form = new ModifyAssetBuilder();
                        f.setBuilder(form);
                        Page add = f.construct();
                        
                        ModifyAsset a = (ModifyAsset)add;
                        a.setValues(m.getUserType(), m.getLbName().getText(),m.getUserID());
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
                        f.setBuilder(form);
                        Page del = f.construct();
                        
                        DeleteAsset d = (DeleteAsset) del;
                        d.setValues(b.viewAsset(n),m.getPassword(), m.getUserType(),m.getLbName().getText());
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
                            f.setBuilder(form);
                            Page edit = f.construct();
                            
                            Page Deco = new ModifyAssetDecorator(edit, b.viewAsset(n));
                            edit = Deco.getForm();
                            
                            ModifyAsset editing = (ModifyAsset)edit;
                            editing.setValues(m.getUserType(), m.getLbName().getText(),m.getUserID());
                            edit = editing;
                            

                            
                            if (m.getUserType() == "custodian"){
                                
                                Deco = new CustodianModifyAssetDecorator(edit);
                                edit = Deco.getForm();
                                edit.setVisible(true);
                                edit.setLocationRelativeTo(null);
                                
                                
                                
                            }
                            else if (m.getUserType() == "owner"){
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
                        
                         form=new AssetViewerBuilder();
                        f.setBuilder(form);
                        Page view = f.construct();
                        
                        AssetViewer a = (AssetViewer) view;
                        a.setValues(b.viewAsset(n),b.getPreviousOwner(n),m.getUserType(), m.getLbName().getText());
                        view=a;
                        view.setVisible(true);
                        
                        a.setVisible(true);
			}
                    }
                    else if(e.getSource().equals(m.getBtLogout())){
                        form = new LoginBuilder();
                        f = new PageDirector();
                        f.setBuilder(form);
                        Page login = f.construct();
                        
                        m.dispose();
                        
                        login.setVisible(true);
                        login.setLocationRelativeTo(null);
                    }
                    else if(e.getSource().equals(m.getBtRefresh())){
                        
                        ResultSet assetList = b.getAssetList(m.getUserType(), m.getLbName().getText());
                        
                        Vector<String> res = new Vector<String>();
                        
                        m.getAssetIDs().removeAllElements();
                        
                    try {
                        while (assetList.next()) {
                        res.add(assetList.getString("assetname")+", Type: "+assetList.getString("assettype"));
                        m.getAssetIDs().add(assetList.getString("assetID"));
                        
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(MainMenuHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                    
                    
      m.getListOfAsset().setListData(res);
                    }
                    
                }
          
          
      }
    