package org.python.pydev.refactoring.tests.adapter;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.python.pydev.core.IGrammarVersionProvider;
import org.python.pydev.core.IPythonNature;
import org.python.pydev.core.TestDependent;
import org.python.pydev.refactoring.ast.adapters.FunctionDefAdapter;
import org.python.pydev.refactoring.ast.adapters.ModuleAdapter;
import org.python.pydev.refactoring.tests.core.AbstractIOTestCase;
import org.python.pydev.refactoring.tests.core.TestData;

public class FunctionDefAdapterTestCase2 extends AbstractIOTestCase{

    public FunctionDefAdapterTestCase2(String name) {
        super(name);
    }

    public void testIt() throws Throwable {
        this.data = new TestData(new File(
                TestDependent.TEST_PYDEV_REFACTORING_PLUGIN_LOC+
                "tests/python/adapter/functiondef2/testFunctionDefAdapter2.py"));

        ModuleAdapter module=this.createModuleAdapterFromDataSource("3.0");
        System.out.println(module);
        List<FunctionDefAdapter> functions = module.getFunctions();
        
        ArrayList<String> found = new ArrayList<String>();
        for(FunctionDefAdapter f:functions){
            found.add(f.getSignature());
        }
        
        String[] expected = new String[]{
            "self",
    
            "self, **kwarg",
    
            "self, pos:int, whence:int, *args, **kwargs",
        };
        assertEquals(Arrays.asList(expected), found);
    }
}
