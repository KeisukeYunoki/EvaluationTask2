package DummyFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class CreateFile {

	protected static boolean createDummyFile(int byteSize)
	{
		/*
		*不具合:フォルダ名と同じため、動かなかった。
		*修正:動くようパス名を変更した。
		*/
		File file = new File("./dummy.bin");
		file.delete();
		try(RandomAccessFile rFile = new RandomAccessFile(file.getPath(), "rw")){
			rFile.setLength(byteSize);
			rFile.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	return true;
	}
}
