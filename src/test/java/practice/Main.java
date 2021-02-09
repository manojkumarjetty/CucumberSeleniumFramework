package practice;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Main {

   public static void main(String[] args) {

      // This represents a cut-copy (Ctrl+X/Ctrl+C) operation.
      // The text will be copied to the clipboard
      // StringSelection is a Transferable implementation
      // class.

  /*    StringSelection data = new StringSelection
         ("This is copied to the clipboard");
      Clipboard cb = Toolkit.getDefaultToolkit()
         .getSystemClipboard();
      cb.setContents(data, data);


      // This represents the paste (Ctrl+V) operation

      try {
         Transferable t = cb.getContents(null);
         if (t.isDataFlavorSupported(DataFlavor.stringFlavor))
            System.out.println(t.getTransferData(DataFlavor
               .stringFlavor));
      } catch (UnsupportedFlavorException | IOException ex) {
          System.out.println("");
      }
  */
   }
}
