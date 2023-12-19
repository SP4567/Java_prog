class ammo 
{
    public void Aim()
    {
        System.out.println("please aim your target!!");
    }
}
class ammunition extends ammo
{
    @Override
    public void Aim()
    {
        System.out.println("after aiming properly at the target please shoot!!");
    }
}
class annotate
{
public static void main(String args[])
{
    ammo a = new ammunition();
    a.Aim();
}
}

