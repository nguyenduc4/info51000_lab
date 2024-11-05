/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Duc Nguyen
 */
interface OrderFullilled {
    public boolean located_and_prepare();
    public boolean place_in_appropriate_box();
    public boolean label_and_information_attach();
    public boolean box_and_item_shipped();
    public boolean check_fullfilment();
}

class WalmartSuperStore implements OrderFullilled { 
    @Override
    public boolean located_and_prepare() { return true; }
    @Override
    public boolean place_in_appropriate_box() { return true; }
    @Override
    public boolean label_and_information_attach() { return true; }
    @Override
    public boolean box_and_item_shipped() { return true; }
    @Override
    public boolean check_fullfilment() { return true; }
}

class WalmartRegularStore implements OrderFullilled { 
    @Override
    public boolean located_and_prepare() { return true; }
    @Override
    public boolean place_in_appropriate_box() { return true; }
    @Override
    public boolean label_and_information_attach() { return true; }
    @Override
    public boolean box_and_item_shipped() { return true; }
    @Override
    public boolean check_fullfilment() { return true; }
}