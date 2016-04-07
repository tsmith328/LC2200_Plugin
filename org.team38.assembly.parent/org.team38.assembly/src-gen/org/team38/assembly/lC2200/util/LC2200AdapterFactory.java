/**
 * generated by Xtext 2.9.2
 */
package org.team38.assembly.lC2200.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.team38.assembly.lC2200.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.team38.assembly.lC2200.LC2200Package
 * @generated
 */
public class LC2200AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LC2200Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LC2200AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LC2200Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LC2200Switch<Adapter> modelSwitch =
    new LC2200Switch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseDirective(Directive object)
      {
        return createDirectiveAdapter();
      }
      @Override
      public Adapter caseRInstruction(RInstruction object)
      {
        return createRInstructionAdapter();
      }
      @Override
      public Adapter caseIInstruction(IInstruction object)
      {
        return createIInstructionAdapter();
      }
      @Override
      public Adapter caseJInstruction(JInstruction object)
      {
        return createJInstructionAdapter();
      }
      @Override
      public Adapter caseOInstruction(OInstruction object)
      {
        return createOInstructionAdapter();
      }
      @Override
      public Adapter caseNOOPDirective(NOOPDirective object)
      {
        return createNOOPDirectiveAdapter();
      }
      @Override
      public Adapter caseWordDirective(WordDirective object)
      {
        return createWordDirectiveAdapter();
      }
      @Override
      public Adapter caseLADirective(LADirective object)
      {
        return createLADirectiveAdapter();
      }
      @Override
      public Adapter caseRInstructionTrans(RInstructionTrans object)
      {
        return createRInstructionTransAdapter();
      }
      @Override
      public Adapter caseIInstructionImmTrans(IInstructionImmTrans object)
      {
        return createIInstructionImmTransAdapter();
      }
      @Override
      public Adapter caseIInstructionOffsetTrans(IInstructionOffsetTrans object)
      {
        return createIInstructionOffsetTransAdapter();
      }
      @Override
      public Adapter caseIInstructionLabelTrans(IInstructionLabelTrans object)
      {
        return createIInstructionLabelTransAdapter();
      }
      @Override
      public Adapter caseJInstructionTrans(JInstructionTrans object)
      {
        return createJInstructionTransAdapter();
      }
      @Override
      public Adapter caseWordTrans(WordTrans object)
      {
        return createWordTransAdapter();
      }
      @Override
      public Adapter caseLATrans(LATrans object)
      {
        return createLATransAdapter();
      }
      @Override
      public Adapter caseCommentTrans(CommentTrans object)
      {
        return createCommentTransAdapter();
      }
      @Override
      public Adapter caseRegTrans(RegTrans object)
      {
        return createRegTransAdapter();
      }
      @Override
      public Adapter caseLabelBeg(LabelBeg object)
      {
        return createLabelBegAdapter();
      }
      @Override
      public Adapter caseLabelEnd(LabelEnd object)
      {
        return createLabelEndAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.Directive <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.Directive
   * @generated
   */
  public Adapter createDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.RInstruction <em>RInstruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.RInstruction
   * @generated
   */
  public Adapter createRInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.IInstruction <em>IInstruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.IInstruction
   * @generated
   */
  public Adapter createIInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.JInstruction <em>JInstruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.JInstruction
   * @generated
   */
  public Adapter createJInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.OInstruction <em>OInstruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.OInstruction
   * @generated
   */
  public Adapter createOInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.NOOPDirective <em>NOOP Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.NOOPDirective
   * @generated
   */
  public Adapter createNOOPDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.WordDirective <em>Word Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.WordDirective
   * @generated
   */
  public Adapter createWordDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.LADirective <em>LA Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.LADirective
   * @generated
   */
  public Adapter createLADirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.RInstructionTrans <em>RInstruction Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.RInstructionTrans
   * @generated
   */
  public Adapter createRInstructionTransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.IInstructionImmTrans <em>IInstruction Imm Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.IInstructionImmTrans
   * @generated
   */
  public Adapter createIInstructionImmTransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.IInstructionOffsetTrans <em>IInstruction Offset Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.IInstructionOffsetTrans
   * @generated
   */
  public Adapter createIInstructionOffsetTransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.IInstructionLabelTrans <em>IInstruction Label Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.IInstructionLabelTrans
   * @generated
   */
  public Adapter createIInstructionLabelTransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.JInstructionTrans <em>JInstruction Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.JInstructionTrans
   * @generated
   */
  public Adapter createJInstructionTransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.WordTrans <em>Word Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.WordTrans
   * @generated
   */
  public Adapter createWordTransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.LATrans <em>LA Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.LATrans
   * @generated
   */
  public Adapter createLATransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.CommentTrans <em>Comment Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.CommentTrans
   * @generated
   */
  public Adapter createCommentTransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.RegTrans <em>Reg Trans</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.RegTrans
   * @generated
   */
  public Adapter createRegTransAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.LabelBeg <em>Label Beg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.LabelBeg
   * @generated
   */
  public Adapter createLabelBegAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.team38.assembly.lC2200.LabelEnd <em>Label End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.team38.assembly.lC2200.LabelEnd
   * @generated
   */
  public Adapter createLabelEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LC2200AdapterFactory
