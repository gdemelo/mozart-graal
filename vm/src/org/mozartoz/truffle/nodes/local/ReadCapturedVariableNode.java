package org.mozartoz.truffle.nodes.local;

import org.mozartoz.truffle.nodes.OzNode;
import org.mozartoz.truffle.runtime.OzArguments;

import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;

public class ReadCapturedVariableNode extends OzNode implements FrameSlotNode {

	@Child CachingReadFrameSlotNode readFrameSlotNode;

	final int depth;

	public ReadCapturedVariableNode(FrameSlot slot, int depth) {
		this.readFrameSlotNode = CachingReadFrameSlotNodeGen.create(slot);
		this.depth = depth;
	}

	public FrameSlot getSlot() {
		return readFrameSlotNode.getSlot();
	}

	@Override
	public Object execute(VirtualFrame frame) {
		Frame parentFrame = OzArguments.getParentFrame(frame, depth);
		return readFrameSlotNode.executeRead(parentFrame);
	}

}
