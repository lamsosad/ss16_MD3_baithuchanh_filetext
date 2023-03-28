package bai2_timmaxtrongfile;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\MD3\\ss16_baithuchanh_file_text\\src\\bai2_timmaxtrongfile\\numbers.txt";
        String PATH_RESULT ="D:\\MD3\\ss16_baithuchanh_file_text\\src\\bai2_timmaxtrongfile\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT,maxValue);
    }

}
