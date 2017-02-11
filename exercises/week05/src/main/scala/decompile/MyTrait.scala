package scala.decompile

sealed trait MyTrait {

}

final case class Thing() extends MyTrait


//need to compile on the command line
//then, to get view what decompiles, run the following on the command line:
//java - jar /Users/thomasmcgarry/Documents/Computer\ Science\ MSc/Important-bits/cfr_0_119.jar Thing.class

//[/Users/thomasmcgarry/Documents/Computer\ Science\ MSc/Important-bits/cfr_0_119.jar] is just the location of the decompiler
//Thing.class is the name of the class to inspect
