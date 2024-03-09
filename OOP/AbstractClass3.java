/**
 * Author: omteja04
 * Description: AbstractClass
 */

package OOP;

public class AbstractClass3 {
    public static void main(String[] args) {

    }
}

abstract class Bank {
    abstract void printInterestRate();

    abstract void printIFSCode();

    abstract void printBranchName();
}

abstract class CanaraBank extends Bank {
    void printInterestRate() {
        System.out.println(7.6);
    }

}

// cSpell:disable
class CanaraBankSurampalemBranch {
    void printInterestRate() {
        System.out.println(7.6);
    }
    
    void printBranchName() {
        System.out.println("Surampalem");
    }
    
    void printIFSCode() {
        System.out.println("CNRB0013268");
    }
}
// cSpell:enable
