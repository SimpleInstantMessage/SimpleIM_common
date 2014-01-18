package org.simpleim.common.handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

import org.simpleim.common.handler.codec.json.JsonDecoder;
import org.simpleim.common.handler.codec.json.JsonEncoder;

/**
 * @see ChannelInitializer
 */
public abstract class BaseHandlerInitializer<C extends Channel> extends ChannelInitializer<C> {
	private static final int LENGTH_FIELD_LENGTH = Integer.SIZE/Byte.SIZE;
	private static final StringDecoder STRING_DECODER = new StringDecoder(CharsetUtil.UTF_8);
	private static final StringEncoder STRING_ENCODER = new StringEncoder(CharsetUtil.UTF_8);
	private static final JsonDecoder JSON_DECODER = new JsonDecoder();
	private static final JsonEncoder JSON_ENCODER = new JsonEncoder();

	@Override
	protected void initChannel(C ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		// Add the text line codec combination first,
		pipeline.addLast("frame_decoder", new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, LENGTH_FIELD_LENGTH, 0, LENGTH_FIELD_LENGTH));
		pipeline.addLast("frame_encoder", new LengthFieldPrepender(LENGTH_FIELD_LENGTH));
		// the encoder and decoder are static as these are sharable
		pipeline.addLast("string_decoder", STRING_DECODER);
		pipeline.addLast("string_encoder", STRING_ENCODER);
		pipeline.addLast("json_decoder", JSON_DECODER);
		pipeline.addLast("json_encoder", JSON_ENCODER);
	}

}
