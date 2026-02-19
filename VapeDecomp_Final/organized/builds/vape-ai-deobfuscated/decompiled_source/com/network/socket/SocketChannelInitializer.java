/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package com.network.socket;

import com.network.decoding.NetworkMessageDecoder;
import com.network.protocol.NetworkPacketDecoder;
import com.network.protocol.NetworkPayloadEncoder837;
import com.network.transmission.NetworkPacketEncoder509;
import com.security.context.SecureContextBroker572;
import com.security.encoding.SecurityEncodingRegistry;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;

class SocketChannelInitializer
extends ChannelInitializer<SocketChannel> {
    final SecureContextBroker572 f;

    SocketChannelInitializer(SecureContextBroker572 secureContextBroker572) {
        this.f = secureContextBroker572;
    }

    protected void k(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        channelPipeline.addLast(new ChannelHandler[]{new ReadTimeoutHandler(30)}).addLast(new ChannelHandler[]{new NetworkPacketDecoder()}).addLast(new ChannelHandler[]{new NetworkMessageDecoder(SecurityEncodingRegistry.CLIENT, true)}).addLast(new ChannelHandler[]{new NetworkPacketEncoder509()}).addLast(new ChannelHandler[]{new NetworkPayloadEncoder837(SecurityEncodingRegistry.SERVER, true)}).addLast(new ChannelHandler[]{SecureContextBroker572.k(this.f)});
    }
}

