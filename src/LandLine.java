public class LandLine implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging=false;
        this.isPowerOn=true;
    }

    @Override

    public boolean powerOn() {
        return isPowerOn();
    }

    @Override
    public void callNumber(String phoneNo) {
         if(isPowerOn==true){
             System.out.println("You are dialling the no: "+phoneNo);
         }
         else{
             System.out.println("Your landline is off");
         }
    }

    @Override
    public void receiveCall(String phoneNo) {
     if(isPowerOn && myPhoneNo.equals(phoneNo)){
         this.isRinging=true;
         System.out.println("hey," +myPhoneNo+"You are dialling");

     }
     else{
         System.out.println("Wrong number");
     }
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        else{
            System.out.println("Power Off");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
      return isRinging;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public void isPowerOn() {
      this.isPowerOn=true;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }
}
