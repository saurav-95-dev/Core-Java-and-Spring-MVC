// Inner class.
// An Inner class can only access static members and methods of the outer class directly.
// How we can we access non-static members and method of outer class inside inner class.

class Saurabh {

    int num1;

    public void saurabhShow() {
        System.out.println("Thisis outer class");
    }

    class Dev {
        
        int num2;

        public void devShow() {
            System.out.println("This is inner class");
        }
    }
    
}

class Hello {
    public static void main(String[] args) {
        System.out.println("This is main method");

    }
}