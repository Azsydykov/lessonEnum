package enums;

public enum Elements {
    HELIUM("Гелий", "He", 2),
    BORUM("Бор","B",5),
    NEON("Неон", "Ne", 10),
    LITHIUM("Литий", "Li", 3),
    NATRIUM("Натрий", "Na",11),
    RHODIUM("Родий", "Rh",45),
    CHLORUM("Хлор", "Cl",17),
    BELIRIY("Берилий", "Be",24);


    private String name;
    private String symbol;
    private int atomNumber;


    public String getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }

    public int getAtomNumber() {
        return atomNumber;
    }

    Elements(String name,String symbol, int atomNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomNumber = atomNumber;
    }

    @Override
    public String toString() {
        return "Elements[" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomNumber=" + atomNumber +
                ']';
    }
}
