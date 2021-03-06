/**
 * This project is licensed under the Apache License, Version 2.0
 * if the following condition is met:
 * (otherwise it cannot be used by anyone but the author, Kevin, only)
 *
 * The original KommonLee project is owned by Lee, Seong Hyun (Kevin).
 *
 * -What does it mean to you?
 * Nothing, unless you want to take the ownership of
 * "the original project" (not yours or forked & modified one).
 * You are free to use it for both non-commercial and commercial projects
 * and free to modify it as the Apache License allows.
 *
 * -So why is this condition necessary?
 * It is only to protect the original project (See the case of Java).
 *
 *
 * Copyright 2009 Lee, Seong Hyun (Kevin)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.elixirian.kommonlee.io.exception;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.elixirian.kommonlee.exception.ElixirianRuntimeException;
import org.junit.Test;

/**
 * <pre>
 *     ___  _____                                              _____
 *    /   \/    / ______ __________________  ______ __ ______ /    /   ______  ______
 *   /        / _/ __  // /  /   / /  /   /_/ __  // //     //    /   /  ___ \/  ___ \
 *  /        \ /  /_/ _/  _  _  /  _  _  //  /_/ _/   __   //    /___/  _____/  _____/
 * /____/\____\/_____//__//_//_/__//_//_/ /_____//___/ /__//________/\_____/ \_____/
 * </pre>
 *
 * <pre>
 *     ___  _____                                _____
 *    /   \/    /_________  ___ ____ __ ______  /    /   ______  ______
 *   /        / /  ___ \  \/  //___// //     / /    /   /  ___ \/  ___ \
 *  /        \ /  _____/\    //   //   __   / /    /___/  _____/  _____/
 * /____/\____\\_____/   \__//___//___/ /__/ /________/\_____/ \_____/
 * </pre>
 *
 * @author Lee, SeongHyun (Kevin)
 * @version 0.0.1 (2010-02-24)
 */
public class RuntimeIoExceptionTest
{
  /**
   * Test method for {@link org.elixirian.kommonlee.io.exception.RuntimeIoException#ElixirianIoException()}.
   */
  @Test
  public final void testElixirianIoException()
  {
    final Exception e = new RuntimeIoException();
    assertThat(e, is(instanceOf(ElixirianRuntimeException.class)));
    assertThat(e, is(instanceOf(RuntimeIoException.class)));
    assertThat(e.getMessage(), is(nullValue()));
  }

  /**
   * Test method for
   * {@link org.elixirian.kommonlee.io.exception.RuntimeIoException#ElixirianIoException(java.lang.String, java.lang.Throwable)}
   * .
   */
  @Test
  public final void testElixirianIoExceptionStringThrowable()
  {
    final String message = "Test Exception";
    final Throwable throwable = new Throwable("Test Throwable");
    final Exception e = new RuntimeIoException(message, throwable);
    assertThat(e, is(instanceOf(ElixirianRuntimeException.class)));
    assertThat(e, is(instanceOf(RuntimeIoException.class)));
    assertThat(e.getMessage(), is(equalTo(message)));
    assertThat(e.getMessage(), is(sameInstance(message)));
    assertThat(e.getCause(), is(equalTo(throwable)));
    assertThat(e.getCause(), is(sameInstance(throwable)));
  }

  /**
   * Test method for
   * {@link org.elixirian.kommonlee.io.exception.RuntimeIoException#ElixirianIoException(java.lang.String)} .
   */
  @Test
  public final void testElixirianIoExceptionString()
  {
    final String message = "Test Exception";
    final Exception e = new RuntimeIoException(message);
    assertThat(e, is(instanceOf(ElixirianRuntimeException.class)));
    assertThat(e, is(instanceOf(RuntimeIoException.class)));
    assertThat(e.getMessage(), is(equalTo(message)));
    assertThat(e.getMessage(), is(sameInstance(message)));
  }

  /**
   * Test method for
   * {@link org.elixirian.kommonlee.io.exception.RuntimeIoException#ElixirianIoException(java.lang.Throwable)}.
   */
  @Test
  public final void testElixirianIoExceptionThrowable()
  {
    final Throwable throwable = new Throwable("Test Throwable");
    final Exception e = new RuntimeIoException(throwable);
    assertThat(e, is(instanceOf(ElixirianRuntimeException.class)));
    assertThat(e, is(instanceOf(RuntimeIoException.class)));
    assertThat(e.getMessage(), is(equalTo("java.lang.Throwable: Test Throwable")));
    assertThat(e.getCause(), is(equalTo(throwable)));
    assertThat(e.getCause(), is(sameInstance(throwable)));
  }

}
