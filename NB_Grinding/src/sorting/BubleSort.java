/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author aglis
 */
public class BubleSort {

    public BubleSort() {

    }

    public int[] doBubleSort(int[] unsortedData) {
        int temp;
        int length = unsortedData.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (unsortedData[j] > unsortedData[j + 1]) {
                    temp = unsortedData[j];
                    unsortedData[j] = unsortedData[j + 1];
                    unsortedData[j + 1] = temp;
                }
            }
        }
        return unsortedData;
    }

    public int[] doReverseBubleSort(int[] unsortedData) {
        int temp;
        int length = unsortedData.length;

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - i - 1; j > 0; j--) {
                if (unsortedData[j] < unsortedData[j - 1]) {
                    temp = unsortedData[j];
                    unsortedData[j] = unsortedData[j - 1];
                    unsortedData[j - 1] = temp;
                }
            }
        }
        return unsortedData;
    }

    public List<Integer> doBubleSort(List<Integer> unsortedData) {
        int temp;
        int length = unsortedData.size();

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (unsortedData.get(j) > unsortedData.get(j + 1)) {
                    temp = unsortedData.get(j);
                    unsortedData.set(j, unsortedData.get(j + 1));
                    unsortedData.set(j + 1, temp);
                }
            }
        }
        return unsortedData;
    }

    public static void main(String[] args) {

        BubleSort bs = new BubleSort();

        int data[] = {1, 4, 2, 5, 8};
        System.out.println(Arrays.toString(bs.doBubleSort(data)));
        System.out.println(Arrays.toString(bs.doReverseBubleSort(data)));

        List<Integer> dataList = Arrays.asList(1, 4, 2, 5, 8);
        System.out.println(bs.doBubleSort(dataList).toString());
    }
}
