package example

import chisel3._
import chisel3.experimental.ExtModule
import chisel3.util.HasExtModuleResource
import chisel3.stage.ChiselStage

class Bar extends ExtModule with HasExtModuleResource {
  /* This resource comes from dsptools. */
  addResource("/BBFACos.v")
  /* This resource comes from the local resources. */
  addResource("/herpderp.v")
}

class Foo extends RawModule {
  val bar = Module(new Bar)
}

object Hello extends App {
  (new ChiselStage).emitVerilog(new Foo, Array("-td", "build"))
}
