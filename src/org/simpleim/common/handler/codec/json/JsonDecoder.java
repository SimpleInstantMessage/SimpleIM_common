package org.simpleim.common.handler.codec.json;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

import org.simpleim.common.message.Message;

import com.google.gson.Gson;

@Sharable
public class JsonDecoder extends MessageToMessageDecoder<String> {
	/* package */ static final Gson GSON = new Gson();

	@Override
	protected void decode(ChannelHandlerContext ctx, String msg, List<Object> out) throws Exception {
		Message message = GSON.fromJson(msg, Message.class);
		String className = Message.class.getPackage().getName() + "." + message.getMessageType();
		Message messageReally = (Message) GSON.fromJson(msg, Class.forName(className));
		out.add(messageReally);
	}

}
