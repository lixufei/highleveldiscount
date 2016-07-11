public enum Good {
    Coocla("ITEM000000", "可口可乐", "瓶", "食品", "碳酸饮料", 3.00);

    private String barcode;
    private String name;
    private String unit;
    private String category;
    private String suCategory;
    private double price;

    Good(String barcode, String name, String unit, String category, String suCategory, double price) {
        this.barcode = barcode;
        this.name = name;
        this.unit = unit;
        this.category = category;
        this.suCategory = suCategory;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
