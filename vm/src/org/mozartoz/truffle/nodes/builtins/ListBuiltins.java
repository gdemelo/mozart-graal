package org.mozartoz.truffle.nodes.builtins;

import org.mozartoz.truffle.nodes.DerefNode;
import org.mozartoz.truffle.nodes.OzNode;
import org.mozartoz.truffle.runtime.OzCons;

import com.oracle.truffle.api.dsl.CreateCast;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

public abstract class ListBuiltins {

	@NodeChild("cons")
	public static abstract class HeadNode extends OzNode {

		@CreateCast("cons")
		protected OzNode derefCons(OzNode cons) {
			return DerefNode.create(cons);
		}

		@Specialization
		protected Object head(OzCons cons) {
			return cons.getHead();
		}

	}

	@NodeChild("cons")
	public static abstract class TailNode extends OzNode {

		@CreateCast("cons")
		protected OzNode derefCons(OzNode cons) {
			return DerefNode.create(cons);
		}

		@Specialization
		protected Object tail(OzCons cons) {
			return cons.getTail();
		}

	}

}
