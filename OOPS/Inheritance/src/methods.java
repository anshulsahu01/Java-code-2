

class plan {

    void takeoff(){
        System.out.println("plan is taking off");
    }

    void fly(){
        System.out.println("plan is flying");
    }  void land(){
        System.out.println("plan is landing");
    }
}
class Cargo extends plan{
    void fly(){
        System.out.println("cargo flys at low hight");
    }
    void carryCargo(){
        System.out.println("cargoplane carries cargo");
    }

}
class PassengerPlan extends plan{
    void fly(){
        System.out.println("cargo flys at medium hight");
    }
    void carryPassenger(){
        System.out.println("Passengerplan carries Passenger");
    }

}
class fighterPlan extends plan{
    void fly(){
        System.out.println("cargo flys at very high hight");
    }
    void carryfighterPlan(){
        System.out.println("fighterPlan carries ammunitons");
    }

}


public class methods {
    public static void main(String args[]){
        Cargo c= new Cargo();

        fighterPlan f=new fighterPlan();

        PassengerPlan p= new PassengerPlan();

        c.takeoff();
        c.fly();
        c.land();
        c.carryCargo();

        System.out.println("#################");

        p.takeoff();
        p.fly();
        p.land();
        p.carryPassenger();

        System.out.println("%%%%%%%%%%%%%%%%%%%");




        f.takeoff();
        f.fly();
        f.land();
        f.carryfighterPlan();

        System.out.println("@@@@@@@@@@@@@");


    }
}

