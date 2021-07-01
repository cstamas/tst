package org.cstamas.tst;

public class Section
{
  section().title("title").paragraph("foo").paragraph("bar")

  section(
      h4("This is title"),
      p("paragraph"),
      p("paragraph"),
      div(
          p
      )
      title(),
      paragraph(),
      paragraph()
      uList(
        el("one"),
        el("two"),
      )
  )
}
