package com.example.goptimus.loubaiss;


public class DrawerItem {

    String ItemName;
    int imgResID;
    String messagecut;
    int countmsg;

    public DrawerItem(String itemName, int imgResID, String messagecut, int countmsg) {
        super();
        ItemName = itemName;
        this.imgResID = imgResID;
        this.messagecut = messagecut;
        this.countmsg = countmsg;
    }

    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        ItemName = itemName;
    }


    public int getImgResID() {
        return imgResID;
    }

    public void setImgResID(int imgResID) {
        this.imgResID = imgResID;
    }

    public int getCountmsg() {
        return this.countmsg;
    }

    public void setMessagecut(int countmsg) {
        this.countmsg = countmsg;
    }

    public void setMessagecut(String messagecut) {
        this.messagecut = messagecut;
    }

}