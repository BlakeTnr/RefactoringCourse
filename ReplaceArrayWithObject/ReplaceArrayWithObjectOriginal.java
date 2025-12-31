package ReplaceArrayWithObject;

class Tournament {
    String[] row = new String[2];
    
    public Torunament() {
        row[0] = "Liverpool";
        row[1] = "15";
    }

    public void displayScore() {
        String name = row[0];
        int score = Integer.parseInt(row[1]);
        // ...
    }
}