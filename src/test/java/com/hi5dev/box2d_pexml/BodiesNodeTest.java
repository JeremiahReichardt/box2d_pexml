package com.hi5dev.box2d_pexml;

import com.badlogic.gdx.physics.box2d.Box2D;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class BodiesNodeTest {
  private PEXML pexml;

  @BeforeClass
  public static void beforeAll() throws Exception {
    Box2D.init();
  }

  @Before
  public void beforeEach() throws Exception {
    File xmlFile = new File("src/test/resources/bugs.xml");

    pexml = new PEXML(xmlFile);
  }

  @Test
  public void testNumberOfBodies() {
    assertEquals(4, pexml.getNumBodies());
  }
}