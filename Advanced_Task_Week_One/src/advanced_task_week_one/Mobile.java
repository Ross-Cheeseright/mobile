/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced_task_week_one;

/**
 *
 * @author Ross
 */
public class Mobile 
{
    // Attributes
    private String manufacturer;
    private double size;
    private int batteryLevel;
    private boolean power;
    private int signalStrength;
    private boolean onCall;
    
    // Constructor WITHOUT parameters //
    public Mobile()
    {
        manufacturer = "Samsung";
        size = 5.5;
        batteryLevel = 50;
        power = true;
        signalStrength = 5;
        onCall = false;
    }
    
    // Constructur WITH parameters // ---------
    // ***//
    
    // Methods // -----------------------------
    public void call()
    {
        if (onCall == true || power == false || signalStrength <= 0)
        {
            System.out.println("You cannot take / make calls right now");
        }
        else
        {
            batteryLevel = batteryLevel -10;
            onCall = true;
            System.out.println("You're on a call!\n");
        }
    }
    
    public void fullCharge()
    {
        if (batteryLevel != 100)
        {
            System.out.println("Fast Charge Commencing:");
            for (int x = batteryLevel; x <=100; x = x + 10)
                    {
                        System.out.println("Battery now at:\t"+ x+"%");
                        batteryLevel = x;
                    }
            
            System.out.println("\nYour battery is now fully charged!");
            System.out.println("Thank you for using the fast-charge module.\n");

        }
    }
    
    public void hangUp()
    {
        if (onCall == true || batteryLevel <=0)
        {
            onCall = false;
            System.out.println("'Click' - the call is ended\n");
        }
    }
    
    // Getter Methods--------------------------
    public String getManufacturer()
    {
        return manufacturer;
    }
    
    public double getSize()
    {
        return size;
    }
    
    public int getBatteryLevel()
    {
        return batteryLevel;
    }
    
    public boolean getPower()
    {
        return power;
    }
    
    public int getSignalStrength()
    {
        return signalStrength;
    }
    
    public boolean getOnCall()
    {
        return onCall;
    }
    
    // Setter Methods -------------------------
    public void setManufacturer (String manufacturerIn)
    {
        manufacturer = manufacturerIn;
    }
    
    public void setSize (double sizeIn)
    {
        size = sizeIn;
    }
    
    public void setBatteryLevel(int batteryIn)
    {
        batteryLevel = batteryIn;
    }
    
    public void setPower(boolean powerIn)
    {
        power = powerIn;
    }
    
    public void setSignalStrength(int signalStrengthIn)
    {
        signalStrength = signalStrengthIn;
    }
    
    public void setOnCall (boolean onCallIn)
    {
        onCall = onCallIn;
    }
}
