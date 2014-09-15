package com.pampanet.server.nio.sample;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class BootstrapNettyModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(BootstrapNettyServer.class);
	}

	@Provides
	public SocketAddress provideSocketAddress() {
		return new InetSocketAddress(8080);
	}

	@Provides
	public EventLoopGroup providesEventLoopGroup() {
		return new NioEventLoopGroup();
	}
	
	@Provides
	public ChannelInitializer<SocketChannel> provideChannelInit(final BootstrapServerHandler serverHandler) {
		return new ChannelInitializer<SocketChannel>() {
			@Override
			public void initChannel(SocketChannel ch) throws Exception {
				ch.pipeline().addLast(serverHandler);
			}
		};
	}
}
