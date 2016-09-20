package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class CreatandSaveANotebook {
	public static void main(String... args) throws IOException {
				
		String dataDir = Utils.getSharedDataDir(CreatandSaveANotebook.class) + "Notebook/";

		Notebook notebook = new Notebook();

		// Save the Notebook
		notebook.save(dataDir + "CreatandSaveANotebook.onetoc2");
	}

}
