class Solution {
    private record Pair(int first, int second){}

    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 0; i < position.length; i++)
        {
            Pair pair = new Pair(position[i], speed[i]);
            list.add(pair);
        }
        list.sort((a, b) -> Integer.compare(b.first(), a.first()));

        Stack<Double> carsTime = new Stack<>();
        for(Pair car : list)
        {
            double timeRemaining = (double)(target - car.first())/car.second();
            if(carsTime.isEmpty())
            {            
                carsTime.push(timeRemaining);
            }
            else{
                if(timeRemaining > carsTime.peek())
                {
                    carsTime.push(timeRemaining);
                }
            }
        }
        return carsTime.size();
    }
}