package src.main.java.com.os.interfaces;

import src.main.java.com.os.JobDispatchList;

import java.io.IOException;

public interface IReader {

    public JobDispatchList okuma(String filePath) throws IOException;

}
