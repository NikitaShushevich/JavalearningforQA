public class HandshakeProblem {
    public static int GetParticipants(int handshakes) {
        int minPeople = 0;
        int totalHandshakes = 0;

        while (totalHandshakes < handshakes) {
            minPeople++;
            totalHandshakes = (minPeople * (minPeople - 1)) / 2;
        }

        return minPeople;
    }


    public static void main(String[] args) {
        System.out.println(GetParticipants(6));
    }
}
