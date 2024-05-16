class Vehicle
{
    int se(int seatsno)
    {
        int no_of_seats = seatsno;
        return no_of_seats;
    }

    int wh(int wheelsno)
    {
        int no_of_wheels = wheelsno;
        return no_of_wheels;
    }
}

public class VehicleMain1
{
    public static void main(String[] args) 
    {
        Vehicle motorcycle = new Vehicle();
        Vehicle car = new Vehicle();

        System.out.println("Motorcycle has: " + motorcycle.se(1) + " seats and "+motorcycle.wh(2) + " wheels");
        System.out.println("Car has: " + car.se(5) + " seats and " + car.wh(4) + " wheels");
    }
}
