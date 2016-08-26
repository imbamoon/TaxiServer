package com.zyw.taxiserver.controller;

import com.zyw.taxiserver.database.MySqlHelper;
import com.zyw.taxiserver.model.User;
import com.sun.glass.ui.Size;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class TaxiServer {

    public static void main(String[] args) {
        try {
            NioSocketAcceptor acceptor = new NioSocketAcceptor();

            acceptor.setHandler(new TaxiMessageHandler());

            acceptor.getFilterChain()
                    .addLast("codec",
                            new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
            acceptor.getSessionConfig().setBothIdleTime(60);
            acceptor.bind(new InetSocketAddress(9988));
//            MySqlHelper helper = MySqlHelper.getInstance();
//            helper.insertUser(new User("zyw", "1245255"));
//            User user = new User("zyw", "1245255");
//            user.setLocation(new double[]{102.1254,24.2545});
//            helper.updateUserLocation(user);
//            int count = helper.queryAllUser().size();
//            System.out.println("size = " + count);
//            helper.deleteUser(new User("zyw", "12452f55"));
            System.out.println("server started at localhost:9988");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
