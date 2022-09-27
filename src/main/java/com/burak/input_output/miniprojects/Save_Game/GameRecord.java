package com.burak.input_output.miniprojects.Save_Game;

import java.io.*;

public class GameRecord {

    public static void record(Card[][] cards) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("game_record.bin"))){
            System.out.println("Saving...");
            out.writeObject(cards);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Card[][] takeRecord() {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("game_record.bin"))) {

            Card[][] output = (Card[][]) in.readObject();
            return output;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
