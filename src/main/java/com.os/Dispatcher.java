package src.main.java.com.os;

import src.main.java.com.os.interfaces.IDispatcher;

import java.util.LinkedList;
import java.util.Queue;

public class Dispatcher implements IDispatcher {
    Queue<Integer> GercekZamanlıKuyruk = new LinkedList<>();
    Queue<Integer> KullanıcıProsesKuyruk = new LinkedList<>();
}
