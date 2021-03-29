/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbrc;

/**
 *
 * @author DELL
 */
public class Screenscreen {
    

public static void  main(String args[]){

Splash splash=new Splash();
splash.setVisible(true);
try{
    for(int i=0;i<=100;i++)
         {Thread.sleep(40);
          splash.loadingnum.setText(Integer.toString(i)+"%");
           
          splash.loadingbar.setValue(i);
           if(i<20) splash.loadingtext.setText("Building Source Code");
           if(i>20&&i<30) {splash.loadingtext.setText("Parsing Code");}
           if(i>30&&i<40) {splash.loadingtext.setText("Generating Machine Dependent Code");}
           if(i>40&&i<50){ splash.loadingtext.setText("Creating Object File");}
           if(i>50&&i<60) {splash.loadingtext.setText("Linking Object Files with Libraries");}
           if(i>60&&i<80) {splash.loadingtext.setText("Almost finished");}
           if(i>80&&i<=100) {splash.loadingtext.setText("Done");}}
}catch(Exception e){}
splash.dispose();
About about=new About();
about.setVisible(true);


}







}
