class Computer {
    public void playMusic() {
        System.out.println("PLaying music");

    }

    public String getMyPen() {
        return "I got my pen";
    }
}

class Hello {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMyPen();
        System.out.println(str);
        
    }
}