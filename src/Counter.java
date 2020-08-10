import java.io.*;

/**
 * Counter class that read file ,count number and sum number
 *
 * @author Kittitouch Ingkasompob
 */
public class Counter {
    private int count;
    private double value;
    public void readfile(String filename) {
        File sourcefile = new File(filename);
        try (BufferedReader in = new BufferedReader(new FileReader(sourcefile))) {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.startsWith("#") || line.isEmpty()) {
                    continue;
                }
                double k = Double.parseDouble(line);
                value += k;
                count++;

            }

        } catch(FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get count
     * @return count of number in file
     */
    public int getCount() {
        return count;
    }

    /**
     * Get total number
     * @return value of all number in file
     */
    public double getTotal() {
        return value;
    }
}
