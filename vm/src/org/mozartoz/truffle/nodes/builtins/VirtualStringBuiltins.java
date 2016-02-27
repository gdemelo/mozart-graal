package org.mozartoz.truffle.nodes.builtins;

import static org.mozartoz.truffle.nodes.builtins.Builtin.ALL;

import org.mozartoz.truffle.nodes.OzNode;
import org.mozartoz.truffle.runtime.OzCons;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.object.DynamicObject;
import com.oracle.truffle.api.object.HiddenKey;
import com.oracle.truffle.api.object.Property;

public abstract class VirtualStringBuiltins {

	@Builtin(name = "is")
	@GenerateNodeFactory
	@NodeChild("value")
	public static abstract class IsVirtualStringNode extends OzNode {

		@Specialization
		Object isVirtualString(Object value) {
			return unimplemented();
		}

	}

	@GenerateNodeFactory
	@NodeChild("value")
	public static abstract class ToCompactStringNode extends OzNode {

		@Specialization
		Object toCompactString(Object value) {
			return unimplemented();
		}

	}

	@Builtin(deref = ALL)
	@GenerateNodeFactory
	@NodeChildren({ @NodeChild("value"), @NodeChild("tail") })
	public static abstract class ToCharListNode extends OzNode {

		public abstract Object executeToCharList(Object value, Object tail);

		@Specialization
		Object toCharList(String atom, Object tail) {
			Object list = tail;
			for (int i = atom.length() - 1; i >= 0; i--) {
				list = new OzCons((long) atom.charAt(i), list);
			}
			return list;
		}

		@Specialization
		Object toCharList(DynamicObject record, Object tail) {
			Object list = tail;
			for (Property property : record.getShape().getPropertyListInternal(false)) {
				if (!(property.getKey() instanceof HiddenKey)) {
					Object value = property.get(record, record.getShape());
					list = executeToCharList(value, list);
				}
			}
			return list;
		}

	}

	@GenerateNodeFactory
	@NodeChild("value")
	public static abstract class ToAtomNode extends OzNode {

		@Specialization
		Object toAtom(Object value) {
			return unimplemented();
		}

	}

	@GenerateNodeFactory
	@NodeChild("value")
	public static abstract class LengthNode extends OzNode {

		@Specialization
		Object length(Object value) {
			return unimplemented();
		}

	}

	@GenerateNodeFactory
	@NodeChild("value")
	public static abstract class ToFloatNode extends OzNode {

		@Specialization
		Object toFloat(Object value) {
			return unimplemented();
		}

	}

}
