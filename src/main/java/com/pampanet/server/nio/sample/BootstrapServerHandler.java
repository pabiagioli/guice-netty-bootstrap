package com.pampanet.server.nio.sample;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class BootstrapServerHandler extends ChannelInboundHandlerAdapter{
	
	@Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ctx.write(msg); 
        ctx.flush();
    }
	
	@Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }
	
}
