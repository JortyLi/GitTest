package mian;

import java.util.Arrays;
import java.util.List;

/**
 * @author liheng
 * @data 2020-06-03 14:58
 */
public class test03 {
    public static void main(String[] args) {
        String s = "cttq_inventory_date";
        String s1 = "CTTQBranchStoreID";
        String s2 = "CTTQBranchStoreName";
        String s3 = "CTTQBillCreatedOn";
        String s4 = "cttq_stock_status";
        String s5 = "cttq_ref_drug_no";
        String s6 = "cttq_drug_name";
        String s7 = "cttq_drug_spec";
        String s8 = "cttq_drug_batch";
        String s9 = "cttq_expiry_date";
        String s10 = "cttq_drug_qty";
        String s11 = "cttq_drug_unit";
        String s12 = "cttq_drug_price";
        String s13 = "cttq_drug_amount";
        List<String>list = Arrays.asList(s,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13);
        for (String s21 : list) {
            System.out.println(s21.toUpperCase());
        }
    }
}
