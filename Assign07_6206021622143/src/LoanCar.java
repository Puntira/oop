
/* Name : ภัณฑิรา ศรบุญทอง
 * Id : 6206021622143
 * Room : IT3RC
 * File name : LoanCar.java
*/

public class LoanCar {

    private float carPrice , downPaynment, installment , interestRate;

    public LoanCar(float price , float down , float installments , float ratePerYears) {

        setCarPrice(price);
        setDownPayment(down);
        setInstallment(installments);
        setInterestRate(ratePerYears);
    }

    public void setCarPrice(float price) {

        this.carPrice = price;
    }
    
    public void setDownPayment(float down) {

        this.downPaynment= down;
    }

    public void setInstallment(float installments) {

        this.installment = installments;
    }
    
    public void setInterestRate(float ratePerYears) {

        this.interestRate = ratePerYears;
    }

    public float getCarPrice() {

        return this.carPrice;
    }

    public float getDownPayment() {

        return this.downPaynment;
    }

    public float getInstallment() {

        return this.installment;
    }

    public float getInterestRate() {

        return this.interestRate;
    }

    public float findDownPayment() {

        return getCarPrice() * (getDownPayment() / 100);
    }

    public float findFinance() {

        return getCarPrice() - findDownPayment();
    }

    public float findInterestRate() {

        return getInterestRate() / 12;
    }

    public float findInterestAmount() {

        return findFinance() * (findInterestRate() / 100) * getInstallment();
    }

    public float findNet() {

        return findFinance() + findInterestAmount();
    }

    public float findInstallment() {

        return findNet() / getInstallment();
    }

}