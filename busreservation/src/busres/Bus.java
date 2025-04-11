package busres;

public class Bus {

    private int busNo;

    private boolean ac;

    private int cap;//get(geeting data) and set method(change data)



    Bus(int no,boolean ac,int cap){

        this.busNo=no;

        this.ac=ac;

        this.cap=cap;

    }

    public int getBusNo(){

        return busNo;

    }

    public boolean isAc() {

        return ac;

    }

    public int  getCapacity() {

        return cap;

    }

    public void setAc(boolean val) {

        ac=val;

    }

    public void setCapacity(int cap) {

        cap=cap;

    }

    public void displayBusInfo(){

        System.out.println("Bus No" +busNo +"Ac:" +ac+ "Total Capacity"+ cap);

    }

}