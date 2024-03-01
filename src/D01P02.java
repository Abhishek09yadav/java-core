interface Medicinelnfo {
    void displayLabel();
}

class Tablet implements Medicinelnfo {
    @Override
    public void displayLabel() {
        System.out.println("Store Tablets in a cool dry place.");
    }
}

class Syrup implements Medicinelnfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on prescription.");
    }
}

class Ointment implements Medicinelnfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment is for external use only.");
    }
}

class D01p02 {

}

class TestClass {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        Syrup syrup = new Syrup();
        Ointment ointment = new Ointment();

        tablet.displayLabel();
        syrup.displayLabel();
        ointment.displayLabel();
    }
}

