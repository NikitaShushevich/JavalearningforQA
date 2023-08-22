public class BusSpace {
    public static int enough(int cap, int on, int wait){

    return cap >= on + wait ? cap - on : 0;
    }

    public static void main(String[] args) {
        System.out.println(enough(20, 5, 5));
    }
}
