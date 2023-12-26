package tdd;

public abstract class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
