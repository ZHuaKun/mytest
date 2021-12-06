package edu.soft2.ioc.print;

import lombok.Value;

import javax.print.DocFlavor;

public class GreyInk extends Ink{
    public void setType(String type){
        super.setType(type);
    }
}
