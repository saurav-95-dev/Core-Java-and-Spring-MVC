class Hello {
    public static void main(String[] args) {
        double base = 2;
        double exponent = 3;
        //Math.pow returns a double value by default . Hence declared as double and not as int !
        double result = Math.pow(base, exponent);
        System.out.println(result);

    }
}