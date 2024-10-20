public class Destination {
    private String[] destinations = {"Delhi","Goa","Mumbai","Banglore","Chandigarh"};

    public String[] showDestinations(){
        return destinations.clone();
    }

    public void destinationConfirmation(String destination){
        for(String dest:destinations){
            if(dest.equals(destination)){
                System.out.println("Yes destination is there");
                return;
            }
        }
        System.out.println("No such destination exist");
    }

    public void updateDestination(String name, String destination){
        for (int i = 0; i < destinations.length; i++) {
            if(destinations[i].equals(destination)){
                destinations[i]=destination;
                System.out.println("Destination updated");
                return;
            }
        }
        System.out.println("Destination is not there that you want to change");
    }
}
