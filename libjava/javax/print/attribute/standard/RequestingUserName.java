/* RequestingUserName.java -- 
   Copyright (C) 2004 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package javax.print.attribute.standard;

import java.util.Locale;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.TextSyntax;


/**
 * @author Michael Koch (konqueror@gmx.de)
 */
public final class RequestingUserName extends TextSyntax
  implements PrintRequestAttribute
{
  private static final long serialVersionUID = -2683049894310331454L;

  /**
   * Creates a <code>RequestingUserName</code> object.
   *
   * @param userName the job name
   * @param locale the locale of the user, null means default locale
   *
   * @exception NullPointerException if userName is null
   */
  public RequestingUserName(String userName, Locale locale)
  {
    super(userName, locale);
  }

  /**
   * Tests of obj is equal to this object.
   *
   * @param obj the object to test
   *
   * @return true if both objects are equal, false otherwise.
   */
  public boolean equals(Object obj)
  {
    if(! (obj instanceof RequestingUserName))
      return false;

    return super.equals(obj);
  }

  /**
   * Returns category of this attribute.
   *
   * @return the class <code>RequestingUserName</code> itself
   */
  public Class getCategory()
  {
    return RequestingUserName.class;
  }

  /**
   * Returns name of this attribute.
   *
   * @return the string "requesting-user-name"
   */
  public String getName()
  {
    return "requesting-user-name";
  }
}
