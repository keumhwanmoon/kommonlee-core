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
package org.elixirian.kommonlee.util.number;

import static java.util.Arrays.*;
import static org.elixirian.kommonlee.util.number.DoubleTotal.*;
import static org.elixirian.kommonlee.util.number.Numbers.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Random;

import org.elixirian.kommonlee.type.functional.Function1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Lee, SeongHyun (Kevin)
 * @version 0.0.1 (2011-04-11)
 */
public class DoubleTotalTest
{
  // private static final int HOW_MANY = 30;

  /* @formatter:off */
	private static final double[] NUMBERS1 = { Integer.MIN_VALUE, -5,   -4,  -3,  -2,  -1,  0,  1,  2,  3,  4,  5,  Integer.MAX_VALUE };
	private static final double[] NUMBERS2 = { Integer.MIN_VALUE, -100, -90, -80, -70, -60, 10, 20, 30, 40, 50, 60, Integer.MAX_VALUE };
	/* @formatter:on */

  private static final Random random = new Random();
  private static final double[] NUMBERS3 = getRandomNumbers(3);
  private static final double[] NUMBERS4 = getRandomNumbers(5);

  private static double[] getRandomNumbers(final int length)
  {
    final double[] numbers = new double[length];
    for (int i = 0; i < length; i++)
    {
      numbers[i] = random.nextDouble();
    }
    return numbers;
  }

  @BeforeClass
  public static void setUpBeforeClass() throws Exception
  {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception
  {
  }

  @Before
  public void setUp() throws Exception
  {
  }

  @After
  public void tearDown() throws Exception
  {
  }

  @Test
  public final void testSumDoubleDouble()
  {
    final double[] numbers1 = NUMBERS1;
    final double[] numbers2 = NUMBERS2;

    for (final double n1 : numbers1)
    {
      for (final double n2 : numbers2)
      {
        final double expected = n1 + n2;
        final double actual = sum(n1, n2);
        // System.out.println("expected: " + expected + "\nactual:   " + actual);
        assertTrue(expected == actual);
      }
    }

    final double[] numbers3 = NUMBERS3;
    final double[] numbers4 = NUMBERS4;

    for (final double n1 : numbers3)
    {
      for (final double n2 : numbers4)
      {
        final double expected = n1 + n2;
        final double actual = sum(n1, n2);
        // System.out.println("expected: " + expected + "\nactual:   " + actual);
        assertTrue(expected == actual);
      }
    }
  }

  @Test
  public final void testSumDoubleDoubleDouble()
  {
    final double[] numbers1 = NUMBERS1;
    final double[] numbers2 = NUMBERS2;

    for (final double n1 : numbers1)
    {
      for (final double n2 : numbers2)
      {
        for (final double n3 : numbers1)
        {
          final double expected = n1 + n2 + n3;
          final double actual = sum(n1, n2, n3);
          // System.out.println("expected: " + expected + "\nactual:   " + actual);
          assertTrue(expected == actual);
        }
      }
    }

    final double[] numbers3 = NUMBERS3;
    final double[] numbers4 = NUMBERS4;

    for (final double n1 : numbers3)
    {
      for (final double n2 : numbers4)
      {
        for (final double n3 : numbers3)
        {
          final double expected = n1 + n2 + n3;
          final double actual = sum(n1, n2, n3);
          // System.out.println("expected: " + expected + "\nactual:   " + actual);
          assertTrue(expected == actual);
        }
      }
    }
  }

  @Test
  public final void testSumDoubleDoubleDoubleDouble()
  {
    final double[] numbers1 = NUMBERS1;
    final double[] numbers2 = NUMBERS2;

    for (final double n1 : numbers1)
    {
      for (final double n2 : numbers2)
      {
        for (final double n3 : numbers1)
        {
          for (final double n4 : numbers2)
          {
            final double expected = n1 + n2 + n3 + n4;
            final double actual = sum(n1, n2, n3, n4);
            // System.out.println("expected: " + expected + "\nactual:   " + actual);
            assertTrue(expected == actual);
          }
        }
      }
    }

    final double[] numbers3 = NUMBERS3;
    final double[] numbers4 = NUMBERS4;

    for (final double n1 : numbers3)
    {
      for (final double n2 : numbers4)
      {
        for (final double n3 : numbers3)
        {
          for (final double n4 : numbers4)
          {
            final double expected = n1 + n2 + n3 + n4;
            final double actual = sum(n1, n2, n3, n4);
            // System.out.println("expected: " + expected + "\nactual:   " + actual);
            assertTrue(expected == actual);
          }
        }
      }
    }
  }

  @Test
  public final void testSumDoubleDoubleDoubleDoubleDouble()
  {
    final double[] numbers1 = NUMBERS1;
    final double[] numbers2 = NUMBERS2;

    for (final double n1 : numbers1)
    {
      for (final double n2 : numbers2)
      {
        for (final double n3 : numbers1)
        {
          for (final double n4 : numbers2)
          {
            for (final double n5 : numbers1)
            {
              final double expected = n1 + n2 + n3 + n4 + n5;
              final double actual = sum(n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected + "\nactual:   " + actual);
              assertTrue(expected == actual);
            }
          }
        }
      }
    }

    final double[] numbers3 = NUMBERS3;
    final double[] numbers4 = NUMBERS4;

    for (final double n1 : numbers3)
    {
      for (final double n2 : numbers4)
      {
        for (final double n3 : numbers3)
        {
          for (final double n4 : numbers4)
          {
            for (final double n5 : numbers3)
            {
              final double expected = n1 + n2 + n3 + n4 + n5;
              final double actual = sum(n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected + "\nactual:   " + actual);
              assertTrue(expected == actual);
            }
          }
        }
      }
    }
  }

  @Test
  public final void testSumDoubleDoubleDoubleDoubleDoubleMoreDoubles()
  {
    final double[] numbers1 = NUMBERS1;
    final double[] numbers2 = NUMBERS2;

    for (final double n1 : numbers1)
    {
      for (final double n2 : numbers2)
      {
        for (final double n3 : numbers1)
        {
          for (final double n4 : numbers2)
          {
            for (final double n5 : numbers1)
            {
              final double expected1 = n1 + n2 + n3 + n4 + n5 + n1 + n2 + n3 + n4 + n5;
              final double actual1 = sum(n1, n2, n3, n4, n5, n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
              assertTrue(expected1 == actual1);
              final double expected2 = n1 + n2 + n3 + n4 + n5 + n1 + n2 + n3 + n4 + n5;
              final double actual2 = sum(n1, n2, n3, n4, n5, n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected2 + "\nactual:   " + actual2);
              assertTrue(expected2 == actual2);
            }
          }
        }
      }
    }

    final double[] numbers3 = new double[NUMBERS3.length];
    System.arraycopy(NUMBERS3, 0, numbers3, 0, NUMBERS3.length);
    final double[] numbers4 = new double[NUMBERS4.length];
    System.arraycopy(NUMBERS4, 0, numbers4, 0, NUMBERS4.length);

    for (final double n1 : numbers3)
    {
      for (final double n2 : numbers4)
      {
        for (final double n3 : numbers3)
        {
          for (final double n4 : numbers4)
          {
            for (final double n5 : numbers3)
            {
              final double expected3 = n1 + n2 + n3 + n4 + n5 + n1 + n2 + n3 + n4 + n5;
              final double actual3 = sum(n1, n2, n3, n4, n5, n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
              assertTrue(expected3 == actual3);
              final double expected4 = n1 + n2 + n3 + n4 + n5 + n1 + n2 + n3 + n4 + n5;
              final double actual4 = sum(n1, n2, n3, n4, n5, n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected4 + "\nactual:   " + actual4);
              assertTrue(expected4 == actual4);
            }
          }
        }
      }
    }
  }

  @Test
  public final void testSumDoubleDoubleDoubleDoubleDoubleDoubleArray()
  {
    final double[] numbers1 = NUMBERS1;
    final double[] numbers2 = NUMBERS2;

    for (final double n1 : numbers1)
    {
      for (final double n2 : numbers2)
      {
        for (final double n3 : numbers1)
        {
          for (final double n4 : numbers2)
          {
            for (final double n5 : numbers1)
            {

              double total1 = n1 + n2 + n3 + n4 + n5;
              for (final double n : numbers1)
                total1 += n;

              @SuppressWarnings("boxing")
              final Double expected1 = total1;
              @SuppressWarnings("boxing")
              final Double actual1 = sum(n1, n2, n3, n4, n5, numbers1);
              // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
              assertThat(actual1, is(equalTo(expected1)));

              double total2 = n1 + n2 + n3 + n4 + n5;
              for (final double n : numbers2)
                total2 += n;

              @SuppressWarnings("boxing")
              final Double expected2 = total2;
              @SuppressWarnings("boxing")
              final Double actual2 = sum(n1, n2, n3, n4, n5, numbers2);
              // System.out.println("expected: " + expected2 + "\nactual:   " + actual2);
              assertThat(actual2, is(equalTo(expected2)));
            }
          }
        }
      }
    }

    final double[] numbers3 = new double[NUMBERS3.length];
    System.arraycopy(NUMBERS3, 0, numbers3, 0, NUMBERS3.length);
    final double[] numbers4 = new double[NUMBERS4.length];
    System.arraycopy(NUMBERS4, 0, numbers4, 0, NUMBERS4.length);

    for (final double n1 : numbers3)
    {
      for (final double n2 : numbers4)
      {
        for (final double n3 : numbers3)
        {
          for (final double n4 : numbers4)
          {
            for (final double n5 : numbers3)
            {
              double total3 = n1 + n2 + n3 + n4 + n5;
              for (final double n : numbers3)
                total3 += n;

              @SuppressWarnings("boxing")
              final Double expected3 = total3;
              @SuppressWarnings("boxing")
              final Double actual3 = sum(n1, n2, n3, n4, n5, numbers3);
              // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
              assertThat(actual3, is(equalTo(expected3)));

              double total4 = n1 + n2 + n3 + n4 + n5;
              for (final double n : numbers4)
                total4 += n;

              @SuppressWarnings("boxing")
              final Double expected4 = total4;
              @SuppressWarnings("boxing")
              final Double actual4 = sum(n1, n2, n3, n4, n5, numbers4);
              // System.out.println("expected: " + expected4 + "\nactual:   " + actual4);
              assertThat(actual4, is(equalTo(expected4)));
            }
          }
        }
      }
    }
  }

  @Test
  public final void testSumDoubleArray()
  {
    final double[] numbers1 = NUMBERS1;
    final double[] numbers2 = NUMBERS2;

    double total1 = 0;
    for (final double n : numbers1)
      total1 += n;

    double total2 = 0;
    for (final double n : numbers2)
      total2 += n;

    final double expected1 = total1;
    final double actual1 = sum(numbers1);
    // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
    assertTrue(expected1 == actual1);
    final double expected2 = total2;
    final double actual2 = sum(numbers2);
    // System.out.println("expected: " + expected2 + "\nactual:   " + actual2);
    assertTrue(expected2 == actual2);

    final double[] numbers3 = NUMBERS3;
    final double[] numbers4 = NUMBERS4;

    double total3 = 0;
    for (final double n : numbers3)
      total3 += n;

    double total4 = 0;
    for (final double n : numbers4)
      total4 += n;

    final double expected3 = total3;
    final double actual3 = sum(numbers3);
    // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
    assertTrue(expected3 == actual3);

    final double expected4 = total4;
    final double actual4 = sum(numbers4);
    // System.out.println("expected: " + expected4 + "\nactual:   " + actual4);
    assertTrue(expected4 == actual4);
  }

  @Test
  public final void testTotalBoxedDoubleBoxedDouble()
  {
    // System.out.println("\nDoublesTotalTest.testTotalBoxedDoubleBoxedDouble()");
    final Double[] numbers1 = convertToBoxed(NUMBERS1);
    final Double[] numbers2 = convertToBoxed(NUMBERS2);

    for (final Double n1 : numbers1)
    {
      for (final Double n2 : numbers2)
      {
        @SuppressWarnings("boxing")
        final double expected = n1 + n2;

        @SuppressWarnings("boxing")
        final double actual = sum(n1, n2);
        // System.out.println("expected: " + expected + "\nactual:   " + actual);
        assertTrue(expected == actual);
      }
    }

    final Double[] numbers3 = convertToBoxed(NUMBERS3);
    final Double[] numbers4 = convertToBoxed(NUMBERS4);

    for (final Double n1 : numbers3)
    {
      for (final Double n2 : numbers4)
      {
        @SuppressWarnings("boxing")
        final double expected = n1 + n2;

        @SuppressWarnings("boxing")
        final double actual = sum(n1, n2);
        // System.out.println("expected: " + expected + "\nactual:   " + actual);
        assertTrue(expected == actual);
      }
    }
  }

  @Test
  public final void testTotalBoxedDoubleBoxedDoubleBoxedDouble()
  {
    // System.out.println("\nDoublesTotalTest.testTotalBoxedDoubleBoxedDoubleBoxedDouble()");
    final Double[] numbers1 = convertToBoxed(NUMBERS1);
    final Double[] numbers2 = convertToBoxed(NUMBERS2);

    for (final Double n1 : numbers1)
    {
      for (final Double n2 : numbers2)
      {
        for (final Double n3 : numbers1)
        {
          @SuppressWarnings("boxing")
          final double expected = n1 + n2 + n3;

          @SuppressWarnings("boxing")
          final double actual = sum(n1, n2, n3);
          // System.out.println("expected: " + expected + "\nactual:   " + actual);
          assertTrue(expected == actual);
        }
      }
    }

    final Double[] numbers3 = convertToBoxed(NUMBERS3);
    final Double[] numbers4 = convertToBoxed(NUMBERS4);

    for (final Double n1 : numbers3)
    {
      for (final Double n2 : numbers4)
      {
        for (final Double n3 : numbers3)
        {
          @SuppressWarnings("boxing")
          final double expected = n1 + n2 + n3;

          @SuppressWarnings("boxing")
          final double actual = sum(n1, n2, n3);
          // System.out.println("expected: " + expected + "\nactual:   " + actual);
          assertTrue(expected == actual);
        }
      }
    }
  }

  @Test
  public final void testTotalBoxedDoubleBoxedDoubleBoxedDoubleBoxedDouble()
  {
    // System.out.println("\nDoublesTotalTest.testTotalBoxedDoubleBoxedDoubleBoxedDoubleBoxedDouble()");
    final Double[] numbers1 = convertToBoxed(NUMBERS1);
    final Double[] numbers2 = convertToBoxed(NUMBERS2);

    for (final Double n1 : numbers1)
    {
      for (final Double n2 : numbers2)
      {
        for (final Double n3 : numbers1)
        {
          for (final Double n4 : numbers2)
          {
            @SuppressWarnings("boxing")
            final double expected = n1 + n2 + n3 + n4;

            @SuppressWarnings("boxing")
            final double actual = sum(n1, n2, n3, n4);
            // System.out.println("expected: " + expected + "\nactual:   " + actual);
            assertTrue(expected == actual);
          }
        }
      }
    }

    final Double[] numbers3 = convertToBoxed(NUMBERS3);
    final Double[] numbers4 = convertToBoxed(NUMBERS4);

    for (final Double n1 : numbers3)
    {
      for (final Double n2 : numbers4)
      {
        for (final Double n3 : numbers3)
        {
          for (final Double n4 : numbers4)
          {
            @SuppressWarnings("boxing")
            final double expected = n1 + n2 + n3 + n4;

            @SuppressWarnings("boxing")
            final double actual = sum(n1, n2, n3, n4);
            // System.out.println("expected: " + expected + "\nactual:   " + actual);
            assertTrue(expected == actual);
          }
        }
      }
    }
  }

  @Test
  public final void testTotalBoxedDoubleBoxedDoubleBoxedDoubleBoxedDoubleBoxedDouble()
  {
    final Double[] numbers1 = convertToBoxed(NUMBERS1);
    final Double[] numbers2 = convertToBoxed(NUMBERS2);

    for (final Double n1 : numbers1)
    {
      for (final Double n2 : numbers2)
      {
        for (final Double n3 : numbers1)
        {
          for (final Double n4 : numbers2)
          {
            for (final Double n5 : numbers1)
            {
              @SuppressWarnings("boxing")
              final double expected = n1 + n2 + n3 + n4 + n5;

              @SuppressWarnings("boxing")
              final double actual = sum(n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected + "\nactual:   " + actual);
              assertTrue(expected == actual);
            }
          }
        }
      }
    }

    final Double[] numbers3 = convertToBoxed(NUMBERS3);
    final Double[] numbers4 = convertToBoxed(NUMBERS4);

    for (final Double n1 : numbers3)
    {
      for (final Double n2 : numbers4)
      {
        for (final Double n3 : numbers3)
        {
          for (final Double n4 : numbers4)
          {
            for (final Double n5 : numbers3)
            {
              @SuppressWarnings("boxing")
              final double expected = n1 + n2 + n3 + n4 + n5;

              @SuppressWarnings("boxing")
              final double actual = sum(n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected + "\nactual:   " + actual);
              assertTrue(expected == actual);
            }
          }
        }
      }
    }
  }

  @Test
  public final void testTotalBoxedDoubleBoxedDoubleBoxedDoubleBoxedDoubleBoxedDoubleMoreBoxedDoubles()
  {
    final Double[] numbers1 = convertToBoxed(NUMBERS1);
    final Double[] numbers2 = convertToBoxed(NUMBERS2);

    for (final Double n1 : numbers1)
    {
      for (final Double n2 : numbers2)
      {
        for (final Double n3 : numbers1)
        {
          for (final Double n4 : numbers2)
          {
            for (final Double n5 : numbers1)
            {
              @SuppressWarnings("boxing")
              final double expected1 = n1 + n2 + n3 + n4 + n5 + n1 + n2 + n3 + n4 + n5;

              final double actual1 = total(n1, n2, n3, n4, n5, n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
              assertTrue(expected1 == actual1);

              @SuppressWarnings("boxing")
              final double expected2 = n1 + n2 + n3 + n4 + n5 + n1 + n2 + n3 + n4 + n5;
              final double actual2 = total(n1, n2, n3, n4, n5, n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected2 + "\nactual:   " + actual2);
              assertTrue(expected2 == actual2);
            }
          }
        }
      }
    }

    final Double[] numbers3 = new Double[NUMBERS3.length];
    System.arraycopy(convertToBoxed(NUMBERS3), 0, numbers3, 0, NUMBERS3.length);
    final Double[] numbers4 = new Double[NUMBERS4.length];
    System.arraycopy(convertToBoxed(NUMBERS4), 0, numbers4, 0, NUMBERS4.length);

    for (final Double n1 : numbers3)
    {
      for (final Double n2 : numbers4)
      {
        for (final Double n3 : numbers3)
        {
          for (final Double n4 : numbers4)
          {
            for (final Double n5 : numbers3)
            {
              @SuppressWarnings("boxing")
              final double expected3 = n1 + n2 + n3 + n4 + n5 + n1 + n2 + n3 + n4 + n5;
              final double actual3 = total(n1, n2, n3, n4, n5, n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
              assertTrue(expected3 == actual3);

              @SuppressWarnings("boxing")
              final double expected4 = n1 + n2 + n3 + n4 + n5 + n1 + n2 + n3 + n4 + n5;
              final double actual4 = total(n1, n2, n3, n4, n5, n1, n2, n3, n4, n5);
              // System.out.println("expected: " + expected4 + "\nactual:   " + actual4);
              assertTrue(expected4 == actual4);
            }
          }
        }
      }
    }
  }

  @Test
  public final void testTotalBoxedDoubleBoxedDoubleBoxedDoubleBoxedDoubleBoxedDoubleBoxedDoubleArray()
  {
    final Double[] numbers1 = convertToBoxed(NUMBERS1);
    final Double[] numbers2 = convertToBoxed(NUMBERS2);

    double total1 = 0;
    for (final Double n : numbers1)
      total1 += n.doubleValue();

    double total2 = 0;
    for (final Double n : numbers2)
      total2 += n.doubleValue();

    for (final Double n1 : numbers1)
    {
      for (final Double n2 : numbers2)
      {
        for (final Double n3 : numbers1)
        {
          for (final Double n4 : numbers2)
          {
            for (final Double n5 : numbers1)
            {
              @SuppressWarnings("boxing")
              final double expected1 = n1 + n2 + n3 + n4 + n5 + total1;

              final double actual1 = total(n1, n2, n3, n4, n5, numbers1);
              // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
              assertTrue(expected1 == actual1);

              @SuppressWarnings("boxing")
              final double expected2 = n1 + n2 + n3 + n4 + n5 + total2;
              final double actual2 = total(n1, n2, n3, n4, n5, numbers2);
              // System.out.println("expected: " + expected2 + "\nactual:   " + actual2);
              assertTrue(expected2 == actual2);
            }
          }
        }
      }
    }

    final Double[] numbers3 = new Double[NUMBERS3.length];
    System.arraycopy(convertToBoxed(NUMBERS3), 0, numbers3, 0, NUMBERS3.length);
    final Double[] numbers4 = new Double[NUMBERS4.length];
    System.arraycopy(convertToBoxed(NUMBERS4), 0, numbers4, 0, NUMBERS4.length);

    for (final Double n1 : numbers3)
    {
      for (final Double n2 : numbers4)
      {
        for (final Double n3 : numbers3)
        {
          for (final Double n4 : numbers4)
          {
            for (final Double n5 : numbers3)
            {

              @SuppressWarnings("boxing")
              double total3 = (n1 + n2 + n3 + n4 + n5);
              for (final Double n : numbers3)
                total3 += n.doubleValue();

              @SuppressWarnings("boxing")
              final Double expected3 = total3;
              @SuppressWarnings("boxing")
              final Double actual3 = total(n1, n2, n3, n4, n5, numbers3);
              // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
              assertThat(actual3, is(equalTo(expected3)));

              @SuppressWarnings("boxing")
              double total4 = (n1 + n2 + n3 + n4 + n5);
              for (final Double n : numbers4)
                total4 += n.doubleValue();

              @SuppressWarnings("boxing")
              final Double expected4 = total4;
              @SuppressWarnings("boxing")
              final Double actual4 = total(n1, n2, n3, n4, n5, numbers4);
              // System.out.println("expected: " + expected4 + "\nactual:   " + actual4);
              assertThat(actual4, is(equalTo(expected4)));
            }
          }
        }
      }
    }
  }

  @Test
  public final void testTotalBoxedDoubleArray()
  {
    final Double[] numbers1 = convertToBoxed(NUMBERS1);
    final Double[] numbers2 = convertToBoxed(NUMBERS2);

    double total1 = 0;
    for (final Double n : numbers1)
      total1 += n.doubleValue();

    double total2 = 0;
    for (final Double n : numbers2)
      total2 += n.doubleValue();

    final double expected1 = total1;
    final double actual1 = total(numbers1);
    // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
    assertTrue(expected1 == actual1);
    final double expected2 = total2;
    final double actual2 = total(numbers2);
    // System.out.println("expected: " + expected2 + "\nactual:   " + actual2);
    assertTrue(expected2 == actual2);

    final Double[] numbers3 = convertToBoxed(NUMBERS3);
    final Double[] numbers4 = convertToBoxed(NUMBERS4);

    double total3 = 0;
    for (final Double n : numbers3)
      total3 += n.doubleValue();

    double total4 = 0;
    for (final Double n : numbers4)
      total4 += n.doubleValue();

    final double expected3 = total3;
    final double actual3 = total(numbers3);
    // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
    assertTrue(expected3 == actual3);

    final double expected4 = total4;
    final double actual4 = total(numbers4);
    // System.out.println("expected: " + expected4 + "\nactual:   " + actual4);
    assertTrue(expected4 == actual4);
  }

  @SuppressWarnings({ "unchecked", "boxing" })
  private static final ValueContainer<Double>[] VALUE_CONTAINERS = new ValueContainer[] {
      new ValueContainer<Double>(Double.MIN_VALUE), new ValueContainer<Double>(-5D), new ValueContainer<Double>(-1D),
      new ValueContainer<Double>(0D), new ValueContainer<Double>(1D), new ValueContainer<Double>(3D),
      new ValueContainer<Double>(5D), new ValueContainer<Double>(Double.MAX_VALUE) };

  private static final ValueContainer<Double>[] RANDOM_VALUE_CONTAINERS = getRandomValues(50);

  private static ValueContainer<Double>[] getRandomValues(final int length)
  {
    @SuppressWarnings("unchecked")
    final ValueContainer<Double>[] values = new ValueContainer[length];
    for (int i = 0; i < length; i++)
    {
      @SuppressWarnings("boxing")
      final ValueContainer<Double> valueContainer = new ValueContainer<Double>(random.nextDouble());
      values[i] = valueContainer;
    }
    return values;
  }

  @Test
  public final void testTotalArrayOfT()
  {
    final ValueContainer<Double>[] numbers1 = VALUE_CONTAINERS;

    double total1 = 0;
    for (final ValueContainer<Double> n : numbers1)
      total1 += n.getValue();

    final double expected1 = total1;
    final double actual1 = total(numbers1, new Function1<ValueContainer<Double>, Double>() {
      @Override
      public Double apply(final ValueContainer<Double> input)
      {
        return input.getValue();
      }
    });
    // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
    assertTrue(expected1 == actual1);

    final ValueContainer<Double>[] numbers2 = RANDOM_VALUE_CONTAINERS;

    double total2 = 0;
    for (final ValueContainer<Double> n : numbers2)
      total2 += n.getValue();

    final double expected2 = total2;
    final double actual2 = total(numbers2, new Function1<ValueContainer<Double>, Double>() {
      @Override
      public Double apply(final ValueContainer<Double> input)
      {
        return input.getValue();
      }
    });
    // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
    assertTrue(expected2 == actual2);
  }

  @Test
  public final void testTotalIterableOfDouble()
  {
    final Iterable<Double> numbers1 = asList(convertToBoxed(NUMBERS1));
    final Iterable<Double> numbers2 = asList(convertToBoxed(NUMBERS2));

    double total1 = 0;
    for (final Double n : numbers1)
      total1 += n.doubleValue();

    double total2 = 0;
    for (final Double n : numbers2)
      total2 += n.doubleValue();

    final double expected1 = total1;
    final double actual1 = total(numbers1);
    // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
    assertTrue(expected1 == actual1);
    final double expected2 = total2;
    final double actual2 = total(numbers2);
    // System.out.println("expected: " + expected2 + "\nactual:   " + actual2);
    assertTrue(expected2 == actual2);

    final Iterable<Double> numbers3 = asList(convertToBoxed(NUMBERS3));
    final Iterable<Double> numbers4 = asList(convertToBoxed(NUMBERS4));

    double total3 = 0;
    for (final Double n : numbers3)
      total3 += n.doubleValue();

    double total4 = 0;
    for (final Double n : numbers4)
      total4 += n.doubleValue();

    final double expected3 = total3;
    final double actual3 = total(numbers3);
    // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
    assertTrue(expected3 == actual3);

    final double expected4 = total4;
    final double actual4 = total(numbers4);
    // System.out.println("expected: " + expected4 + "\nactual:   " + actual4);
    assertTrue(expected4 == actual4);
  }

  @Test
  public final void testTotalIterableOfT()
  {
    final Iterable<ValueContainer<Double>> numbers1 = asList(VALUE_CONTAINERS);

    double total1 = 0;
    for (final ValueContainer<Double> n : numbers1)
      total1 += n.getValue();

    final double expected1 = total1;
    final double actual1 = total(numbers1, new Function1<ValueContainer<Double>, Double>() {
      @Override
      public Double apply(final ValueContainer<Double> input)
      {
        return input.getValue();
      }
    });
    // System.out.println("expected: " + expected1 + "\nactual:   " + actual1);
    assertTrue(expected1 == actual1);

    final Iterable<ValueContainer<Double>> numbers2 = asList(RANDOM_VALUE_CONTAINERS);

    double total2 = 0;
    for (final ValueContainer<Double> n : numbers2)
      total2 += n.getValue();

    final double expected2 = total2;
    final double actual2 = total(numbers2, new Function1<ValueContainer<Double>, Double>() {
      @Override
      public Double apply(final ValueContainer<Double> input)
      {
        return input.getValue();
      }
    });
    // System.out.println("expected: " + expected3 + "\nactual:   " + actual3);
    assertTrue(expected2 == actual2);
  }

}
