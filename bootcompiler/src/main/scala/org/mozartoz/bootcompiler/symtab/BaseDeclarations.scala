package org.mozartoz.bootcompiler.symtab

/** Variables declared by the base environment */
object BaseDeclarations {

  def contains(name: String) = declarations contains name

  val declarations = Set(
    "Value",
    "Wait",
    "WaitOr",
    "WaitNeeded",
    "IsFree",
    "IsKinded",
    "IsFuture",
    "IsFailed",
    "IsDet",
    "IsNeeded",
    "Min",
    "Max",
    "CondSelect",
    "HasFeature",
    "ByNeed",
    "ByNeedFuture",
    "Literal",
    "IsLiteral",
    "Unit",
    "IsUnit",
    "Lock",
    "IsLock",
    "NewLock",
    "Cell",
    "IsCell",
    "NewCell",
    "Exchange",
    "Assign",
    "Access",
    "Port",
    "IsPort",
    "NewPort",
    "Send",
    "Atom",
    "IsAtom",
    "AtomToString",
    "Name",
    "IsName",
    "NewName",
    "Bool",
    "IsBool",
    "And",
    "Or",
    "Not",
    "String",
    "IsString",
    "StringToAtom",
    "StringToInt",
    "StringToFloat",
    "Char",
    "IsChar",
    "Int",
    "IsInt",
    "IsNat",
    "IsOdd",
    "IsEven",
    "IntToFloat",
    "IntToString",
    "Float",
    "IsFloat",
    "Exp",
    "Log",
    "Sqrt",
    "Ceil",
    "Floor",
    "Sin",
    "Cos",
    "Tan",
    "Asin",
    "Acos",
    "Atan",
    "Atan2",
    "Round",
    "FloatToInt",
    "FloatToString",
    "Number",
    "IsNumber",
    "Pow",
    "Abs",
    "Tuple",
    "IsTuple",
    "MakeTuple",
    "List",
    "MakeList",
    "IsList",
    "Append",
    "Member",
    "Length",
    "Nth",
    "Reverse",
    "Map",
    "FoldL",
    "FoldR",
    "FoldLTail",
    "FoldRTail",
    "ForAll",
    "All",
    "ForAllTail",
    "AllTail",
    "Some",
    "Filter",
    "Sort",
    "Merge",
    "Flatten",
    "Procedure",
    "IsProcedure",
    "ProcedureArity",
    "Loop",
    "For",
    "ForThread",
    "Record",
    "IsRecord",
    "Arity",
    "Label",
    "Width",
    "Adjoin",
    "AdjoinList",
    "AdjoinAt",
    "MakeRecord",
    "Chunk",
    "IsChunk",
    "NewChunk",
    "VirtualString",
    "IsVirtualString",
    "VirtualByteString",
    "IsVirtualByteString",
    "Coders",
    "WeakDictionary",
    "IsWeakDictionary",
    "NewWeakDictionary",
    "Dictionary",
    "IsDictionary",
    "NewDictionary",
    "Array",
    "IsArray",
    "NewArray",
    "Put",
    "Get",
    "Object",
    "IsObject",
    "BaseObject",
    "New",
    "Class",
    "IsClass",
    "Thread",
    "IsThread",
    "Time",
    "Alarm",
    "Delay",
    "Exception",
    "Raise",
    "Functor",
    "BitArray",
    "IsBitArray",
    "ForeignPointer",
    "IsForeignPointer",
    "CompactString",
    "IsCompactString",
    "CompactByteString",
    "IsCompactByteString",
    "BitString",
    "IsBitString",
    "ByteString",
    "IsByteString",
    "ByNeedDot",
    "LockIn",
    "OoExtensions",
    "`ooFreeFlag`",
    "`ooFallback`")
}
